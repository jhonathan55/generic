package com.example.generic.model

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.generic.interfaces.ComponentGeneric

 class StringComponent: ComponentGeneric<String> {
    @Composable
    override fun Render(data:String){
        Text(text = data)
    }
}

data class User(val name:String,val age:Int)

 class UserComponent : ComponentGeneric<User>{
    @Composable
    override fun Render(data:User){
        Text(text = "Name: ${data.name} Age: ${data.age}")
    }
}