package com.example.retrofitapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.retrofitapi.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

var arrayList=ArrayList<jsonkotlinclass>()
//    https://meme-api.com/gimme
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

binding.button.setOnClickListener {
    getdata()
}

    }

    private fun getdata() {
        Apiinstance.apiinter.getdata().enqueue(object :Callback<jsonkotlinclass>{
            override fun onResponse(
                call: Call<jsonkotlinclass>,
                response: Response<jsonkotlinclass>
            ) {
                binding.title.text=response.body()!!.title
                Picasso.get().load(response.body()!!.url).into(binding.imageView);

                Toast.makeText(this@MainActivity, "data fetched", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(call: Call<jsonkotlinclass>, t: Throwable) {
                Toast.makeText(this@MainActivity, "data fetched failed", Toast.LENGTH_SHORT).show()
            }

        })
    }


}