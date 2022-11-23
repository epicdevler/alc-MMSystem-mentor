package com.peculiaruc.alc_mmsystem_mentor

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentor.data.model.MentorTasks

class TaskAssignedFragment : Fragment() {

    var tasks: ArrayList<MentorTasks> = arrayListOf()

    private val taskOne = MentorTasks(
        1,
        "Write Documentation for Auth",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. " +
                "Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. " +
                "Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh, " +
                "at maximus ante fermentum sit amet. Pellentesque commodo lacus at sodales sodales",
        false,
        false,
        0
    )
    private val taskTwo = MentorTasks(
        2,
        "Implement Dependency Injection",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. " +
                "Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. " +
                "Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh, ",
        true,
        false,
        3
    )
    private val taskThree = MentorTasks(
        3,
        "Fetch API endpoint for all tasks",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        false,
        true,
        4
    )
    private val taskFour = MentorTasks(
        4,
        "Implement local caching",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        true,
        false,
        3
    )
    private val taskFive = MentorTasks(
        5,
        "Create Database",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        false,
        false,
        5
    )
    private val taskSix = MentorTasks(
        6,
        "Implement Navigation Graph",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        false,
        true,
        5
    )
    private val taskSeven = MentorTasks(
        7,
        "Liaise with Backend on the Settings endpoints",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        false,
        false,
        1
    )
    private val taskEight = MentorTasks(
        8,
        "Implement Firestore caching",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        true,
        false,
        3
    )
    private val taskNine = MentorTasks(
        9,
        "Implement UI for Chat function",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        true,
        false,
        3
    )
    private val taskTen = MentorTasks(
        10,
        "Implement Internationalization",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        false,
        true,
        4
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_task_assigned, container, false)
        val btn = view.findViewById<Button>(R.id.button2)

        btn.setOnClickListener {
            findNavController().navigate(R.id.action_taskAssignedFragment_to_taskFragment)
        }
        val back = view.findViewById<ImageView>(R.id.imageView)
        back.setOnClickListener {
            it.findNavController().navigateUp()
        }

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = arguments
        if (bundle != null) {
            Log.e("TaskAssignedFragment", "Fragment received information")
            val args = TaskAssignedFragmentArgs.fromBundle(bundle)
            val id = args.id
            for (i in tasks.indices) {
                if (tasks.get(i).id == id) {
                    var tv = view.findViewById<TextView>(R.id.textView4)
                    tv?.text = tasks.get(i).title
                    view.findViewById<TextView>(R.id.textView5)?.text = tasks.get(i).desc
                }
            }
        }
    }
}