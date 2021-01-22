    package com.amar.covid19telangana.Adapters;

    import android.content.Context;
    import android.content.Intent;
    import android.net.Uri;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;

    import androidx.annotation.NonNull;
    import androidx.recyclerview.widget.RecyclerView;

    import com.amar.covid19telangana.ViewHolder.OnlinecourseRecyclerViewHolder;
    import com.amar.covid19telangana.R;

    import java.util.ArrayList;

    public class CourseAdapter extends RecyclerView.Adapter<OnlinecourseRecyclerViewHolder> {


        ArrayList<Integer> onlinecouresetitle = new ArrayList<Integer>();
        ArrayList<Integer> onlinecoureseimg = new ArrayList<Integer>();
        ArrayList<String> onlinecoureseurl = new ArrayList<String>();
        Context context;
        LayoutInflater inflater;

        public CourseAdapter(Context applicationContext, ArrayList<Integer> onlinecouresetitle, ArrayList<Integer> onlinecoureseimg, ArrayList<String> onlinecoureseurl) {

            this.context= applicationContext;
            this.onlinecouresetitle = onlinecouresetitle;
            this.onlinecoureseimg = onlinecoureseimg;
            this.onlinecoureseurl = onlinecoureseurl;
            inflater = LayoutInflater.from(context);
        }

        @NonNull
        @Override
        public OnlinecourseRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = inflater.inflate(R.layout.online_course_recycler,parent,false);

            OnlinecourseRecyclerViewHolder holder = new OnlinecourseRecyclerViewHolder(view);

            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull OnlinecourseRecyclerViewHolder holder, int position) {

            holder.coursetitle.setText(onlinecouresetitle.get(position));
            holder.courseimg.setText(onlinecoureseimg.get(position));
            holder.coursecard.setTag(holder);
            holder.coursecard.setOnClickListener(clickListner);


        }

        View.OnClickListener clickListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                OnlinecourseRecyclerViewHolder viewHolder = (OnlinecourseRecyclerViewHolder) view.getTag();
                int position = viewHolder.getPosition();


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(onlinecoureseurl.get(position)));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(intent);



            }
        };
        @Override
        public int getItemCount() {
            return onlinecoureseimg.size();
        }
    }
