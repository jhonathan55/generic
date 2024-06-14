package com.example.generic

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import com.example.generic.databinding.FragmentCardListBinding
import com.example.generic.model.StringComponent
import com.example.generic.model.User
import com.example.generic.model.UserComponent

class CardListFragment : Fragment() {

    private var _binding: FragmentCardListBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentCardListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardView.setOnClickListener {
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra("ID",14159)
            startActivity(intent)
        }
        // Integrar ComposeView en el LinearLayout
        binding.cardView.findViewById<ComposeView>(R.id.compose_view).setContent {
            ComposeCardContent()
        }
    }

    @Composable
    fun ComposeCardContent() {
        Column {
            StringComponent().Render(data = "Hola Infocal!")
           UserComponent().Render(data = User(name = "Jhonathan", age = 29))
        }
    }


}