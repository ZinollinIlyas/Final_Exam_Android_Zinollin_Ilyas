package com.example.finalandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.second_fragment.view.*

class firstFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val inf = inflater.inflate(R.layout.second_fragment, container, false)

        inf.business.setOnClickListener {
            Navigation.findNavController(inf).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        inf.entertainment.setOnClickListener {
            Navigation.findNavController(inf).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        inf.general.setOnClickListener {
            Navigation.findNavController(inf).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        inf.health.setOnClickListener {
            Navigation.findNavController(inf).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        inf.science.setOnClickListener {
            Navigation.findNavController(inf).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        inf.sports.setOnClickListener {
            Navigation.findNavController(inf).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        inf.technology.setOnClickListener {
            Navigation.findNavController(inf).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        return inf
    }

}