package com.amar.covid19telangana.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19telangana.VocationalCourses.Cookery;
import com.amar.covid19telangana.ViewHolder.CourseMainViewHolder;
import com.amar.covid19telangana.VocationalCourses.Language;
import com.amar.covid19telangana.VocationalCourses.Novel;
import com.amar.covid19telangana.VocationalCourses.Onlinecourse;
import com.amar.covid19telangana.R;
import com.amar.covid19telangana.VocationalCourses.Schoolstudent;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


 public class CourseMainAdapter extends RecyclerView.Adapter<CourseMainViewHolder>{

    ArrayList<Integer> coursenamelist = new ArrayList<Integer>();
    ArrayList<Integer> courseimglist = new ArrayList<Integer>();
    Context context;
    LayoutInflater inflater;
    public CourseMainAdapter(Context applicationContext, ArrayList<Integer> courseimglist, ArrayList<Integer> coursenamelist) {

        this.context = applicationContext;
        this.coursenamelist = coursenamelist;
        this.courseimglist = courseimglist;

        inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public CourseMainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.course_main_holder,parent,false);
        CourseMainViewHolder courseMainViewHolder = new CourseMainViewHolder(view);


        return courseMainViewHolder;
    }

    @NonNull

    @Override
    public void onBindViewHolder(@NonNull final CourseMainViewHolder holder, int position) {



        holder.coursetitlemain.setText(coursenamelist.get(position));
        Picasso.with(context).load(courseimglist.get(position)).fit().into(holder.courseimgmain);
        holder.coursecardmain.setTag(holder);
        holder.coursecardmain.setOnClickListener(clickListner);


    }

    View.OnClickListener clickListner =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            CourseMainViewHolder viewHolder = (CourseMainViewHolder) view.getTag();
            int position = viewHolder.getPosition();

            switch (position){
             case 0:

                 Intent intent1 = new Intent(context, Schoolstudent.class);
                 intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                 context.startActivity(intent1);
            break;
            case 1:
                Intent intent0 = new Intent(context, Onlinecourse.class);
                intent0.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent0);
            break;
            case 2:
                Intent intent2 = new Intent(context, Language.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent2);
            break;
            case 3:
                Intent intent3 = new Intent(context, Novel.class);
                intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent3);
            break;
            case 4:
                Intent intent4 = new Intent(context, Cookery.class);
                intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent4);
            break;

            }

        }
    };

    @Override
    public int getItemCount() {
        return courseimglist.size();
    }
}
