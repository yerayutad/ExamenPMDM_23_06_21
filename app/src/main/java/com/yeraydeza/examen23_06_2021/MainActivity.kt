package com.yeraydeza.examen23_06_2021

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        

        annadiramigo.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
    private fun setupRecyclerView(){
        recyclerView1.layoutManager = LinearLayoutManager(this)
        val listaAmigos:List<Amigos> = listOf(Amigos("Yeray","Deza", "hola@gmail.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.xatakamovil.com%2Ftutoriales%2Ftres-metodos-para-cambiar-foto-perfil-tu-cuenta-google-android&psig=AOvVaw0OTL02fViS3GEHZpvilnsA&ust=1624527666231000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCPjE2qa7rfECFQAAAAAdAAAAABAD","26/05/2001","ninguna"),
            Amigos("Yeray1","Deza1", "hola1@gmail.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.xatakamovil.com%2Ftutoriales%2Ftres-metodos-para-cambiar-foto-perfil-tu-cuenta-google-android&psig=AOvVaw0OTL02fViS3GEHZpvilnsA&ust=1624527666231000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCPjE2qa7rfECFQAAAAAdAAAAABAD","27/05/2001","ninguna1"),
            Amigos("Yeray2","Deza2", "hola2@gmail.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.xatakamovil.com%2Ftutoriales%2Ftres-metodos-para-cambiar-foto-perfil-tu-cuenta-google-android&psig=AOvVaw0OTL02fViS3GEHZpvilnsA&ust=1624527666231000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCPjE2qa7rfECFQAAAAAdAAAAABAD","28/05/2001","ninguna2"),
            Amigos("Yeray3","Deza3", "hola3@gmail.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.xatakamovil.com%2Ftutoriales%2Ftres-metodos-para-cambiar-foto-perfil-tu-cuenta-google-android&psig=AOvVaw0OTL02fViS3GEHZpvilnsA&ust=1624527666231000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCPjE2qa7rfECFQAAAAAdAAAAABAD","29/05/2001","ninguna3"))

        recyclerView1.adapter = RecyclerAdapter(this, listaAmigos)
    }
}