package com.example.sampleapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleapplication.databinding.FragmentHomeBinding
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: PhotoGalleryAdapter
    lateinit var list: ArrayList<GalleryModel>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        list = ArrayList()
        var layout = LinearLayoutManager(context)
        layout.orientation = RecyclerView.HORIZONTAL
        binding.rvGallery.layoutManager = layout
        adapter = PhotoGalleryAdapter(list, this.requireActivity())
        binding.rvGallery.adapter = adapter
        list.add(GalleryModel(R.drawable.our_gallery1))
        list.add(GalleryModel(R.drawable.ourgaller2))
        list.add(GalleryModel(R.drawable.ourgallery3))
        list.add(GalleryModel(R.drawable.our_gallery1))
        list.add(GalleryModel(R.drawable.ourgaller2))
        list.add(GalleryModel(R.drawable.ourgallery3))
        list.add(GalleryModel(R.drawable.our_gallery1))
        list.add(GalleryModel(R.drawable.ourgaller2))
        list.add(GalleryModel(R.drawable.ourgallery3))

        adapter.notifyDataSetChanged()
        return binding.root
        return binding.root
    }

}
