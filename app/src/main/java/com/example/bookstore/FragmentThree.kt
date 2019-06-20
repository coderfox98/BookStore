package com.example.bookstore


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentThree : Fragment() {

    private var fictionList : MutableList<Int> = mutableListOf(
        R.drawable.fiction_one,R.drawable.children_two,
        R.drawable.children_three,R.drawable.children_four,
        R.drawable.children_five,R.drawable.children_six,
        R.drawable.children_seven,R.drawable.children_eight,
        R.drawable.children_nine,R.drawable.children_ten,
        R.drawable.fiction_one,R.drawable.children_two,
        R.drawable.children_three,R.drawable.children_four,
        R.drawable.children_five,R.drawable.children_six,
        R.drawable.children_seven,R.drawable.children_eight,
        R.drawable.children_nine,R.drawable.children_ten
    )

    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter : RecyclerViewAdapter
    private lateinit var layoutManager : StaggeredGridLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_three, container, false)

        recyclerView = view.findViewById(R.id.recycler_view_three)

        adapter = RecyclerViewAdapter(fictionList)

        layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter

        return view
    }


}
