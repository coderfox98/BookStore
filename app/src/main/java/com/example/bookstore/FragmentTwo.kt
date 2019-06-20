package com.example.bookstore


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentTwo : Fragment() {

    private var childrenList : MutableList<Int> = mutableListOf(
        R.drawable.children_one,R.drawable.children_two,
        R.drawable.children_three,R.drawable.children_four,
        R.drawable.children_five,R.drawable.children_six,
        R.drawable.children_seven,R.drawable.children_eight,
        R.drawable.children_nine,R.drawable.children_ten,
        R.drawable.children_one,R.drawable.children_two,
        R.drawable.children_three,R.drawable.children_four,
        R.drawable.children_five,R.drawable.children_six,
        R.drawable.children_seven,R.drawable.children_eight,
        R.drawable.children_nine,R.drawable.children_ten
    )

    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter : RecyclerViewAdapter
    private lateinit var layout : GridLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_two, container, false)

        recyclerView = view.findViewById(R.id.recycler_view)
        adapter = RecyclerViewAdapter(childrenList)
        layout = GridLayoutManager(context!!,3)

        recyclerView.layoutManager = layout

        recyclerView.adapter = adapter



        return view

    }


}
