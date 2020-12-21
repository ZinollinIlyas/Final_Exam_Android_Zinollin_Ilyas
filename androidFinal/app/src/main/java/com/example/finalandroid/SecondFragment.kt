package com.example.finalandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.second_fragment.view.*
/*  business
    entertainment
    general
    health
    science
    sports
    technology
 *///choosing
class SecondFragment: Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val viewInfos = inflater.inflate(R.layout.second_fragment, container, false)

        viewInfos.business.setOnClickListener {
            Navigation.findNavController(viewInfos).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        viewInfos.entertainment.setOnClickListener {
            Navigation.findNavController(viewInfos).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        viewInfos.general.setOnClickListener {
            Navigation.findNavController(viewInfos).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        viewInfos.health.setOnClickListener {
            Navigation.findNavController(viewInfos).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        viewInfos.science.setOnClickListener {
            Navigation.findNavController(viewInfos).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        viewInfos.sports.setOnClickListener {
            Navigation.findNavController(viewInfos).navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        viewInfos.technology.setOnClickListener {
            Navigation.findNavController(viewInfos).navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        return viewInfos
    }
}