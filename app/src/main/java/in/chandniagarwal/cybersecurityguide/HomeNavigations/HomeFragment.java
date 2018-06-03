package in.chandniagarwal.cybersecurityguide.HomeNavigations;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import in.chandniagarwal.cybersecurityguide.Models.HomeCards;
import in.chandniagarwal.cybersecurityguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_fragment, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));


        List<HomeCards> list = new ArrayList<>();
        list.add(new HomeCards(
                R.drawable.victim,
                "Are you hacked?",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        ));
        list.add(new HomeCards(
                R.drawable.know,
                "Guide to Threats",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        ));
        list.add(new HomeCards(
                R.drawable.volunteer,
                "Cyber Assistance",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        ));
        list.add(new HomeCards(
                R.drawable.guide,
                "Guidelines",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        ));
        list.add(new HomeCards(
                R.drawable.numbers,
                "Helpline Numbers",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        ));


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

        private List<HomeCards> list;

        public RecyclerViewAdapter(List<HomeCards> list) {
            this.list = list;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_block, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.textView.setText(list.get(position).getTitle());
            holder.imageView.setImageResource(list.get(position).getImageId());
            holder.root.setOnClickListener(list.get(position).getListener());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView imageView;
            public TextView textView;
            public CardView root;
            public ViewHolder(View itemView) {
                super(itemView);
                this.imageView = itemView.findViewById(R.id.icon);
                this.textView = itemView.findViewById(R.id.text);
                this.root = itemView.findViewById(R.id.root);
            }
        }
    }

}
