package com.example.bookstore


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FragmentOne : Fragment() {

    private lateinit var gridView : GridView

    var topList : MutableList<Int> = mutableListOf(
        R.drawable.top_one,R.drawable.top_two,
        R.drawable.top_three,R.drawable.top_four,
        R.drawable.top_five,R.drawable.top_six,
        R.drawable.top_seven,R.drawable.top_eight,
        R.drawable.top_nine,R.drawable.top_ten,
        R.drawable.top_one,R.drawable.top_two,
        R.drawable.top_three,R.drawable.top_four,
        R.drawable.top_five,R.drawable.top_six,
        R.drawable.top_seven,R.drawable.top_eight,
        R.drawable.top_nine,R.drawable.top_ten
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one, container, false)

        gridView = view.findViewById(R.id.grid_view)

        val adapter = TopListAdapter(topList,context!!)

        gridView.adapter = adapter

        return view
    }


}
