package com.example.sampleapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.sampleapplication.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {
    private lateinit var binding: FragmentGalleryBinding
    private lateinit var adapter: gallery_adapter
    lateinit var list: ArrayList<GalleryModel>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGalleryBinding.inflate(inflater, container, false)
        list = ArrayList()
        var layout = GridLayoutManager(context, 2)
        binding.rvGallery.layoutManager=layout
        adapter = gallery_adapter(list, requireActivity())
        binding.rvGallery.adapter=adapter
        list.add(GalleryModel(R.drawable.img))
        list.add(GalleryModel(R.drawable.img2))
        list.add(GalleryModel(R.drawable.img))
        list.add(GalleryModel(R.drawable.img2))
        list.add(GalleryModel(R.drawable.img))
        list.add(GalleryModel(R.drawable.img2))
        list.add(GalleryModel(R.drawable.img))
        list.add(GalleryModel(R.drawable.img2))
        list.add(GalleryModel(R.drawable.img))
        list.add(GalleryModel(R.drawable.img2))
        list.add(GalleryModel(R.drawable.img))
        list.add(GalleryModel(R.drawable.img2))

        adapter.notifyDataSetChanged()
        return binding.root
    }

}