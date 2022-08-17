package com.example.weather.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weather.adapter.WeatherAdapter
import com.example.weather.adapter.WeatherModel
import com.example.weather.databinding.FragmentHoursBinding


class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding) {
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel("", "09:00",
                "Солнечно", "22°C",
                "", "", "", ""),
            WeatherModel("", "10:00",
                "Солнечно", "24°C",
                "", "", "", ""),
            WeatherModel("", "11:00",
                "Солнечно", "25°C",
                "", "", "", ""),
            WeatherModel("", "12:00",
                "Солнечно", "29°C",
                "", "", "", ""),
            WeatherModel("", "13:00",
                "Солнечно", "32°C",
                "", "", "", ""),
            WeatherModel("", "14:00",
                "Солнечно", "32°C",
                "", "", "", "")
        )
        adapter.submitList(list)
    }

    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}