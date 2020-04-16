package com.example.myapplication.feature

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.base.view.BaseFragment
import kotlinx.android.synthetic.main.fragment_first.*
import java.util.concurrent.LinkedBlockingDeque
import kotlin.random.Random

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val worker = Worker()
        worker.start()

        button_first.setOnClickListener {
//            findNavController().navigate(
//                R.id.action_FirstFragment_to_SecondFragment,
//                Bundle().apply {
//                    putString("key", "hello")
//                })

            worker.queue.push("${Random.nextDouble()}")
        }
    }
}

class Worker : Thread() {
    val queue = LinkedBlockingDeque<String>()
    override fun run() {
        super.run()
        while (true) {
            if (!queue.isEmpty()) {
                println("Queue : ${queue.poll()}")
            }
        }
    }
}
