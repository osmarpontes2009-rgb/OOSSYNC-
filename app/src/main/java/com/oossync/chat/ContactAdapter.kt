package com.oossync.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private List<String> contacts;
    private OnContactClickListener onContactClickListener;

    public interface OnContactClickListener {
        void onContactClick(String contact);
    }

    public ContactAdapter(List<String> contacts, OnContactClickListener listener) {
        this.contacts = contacts;
        this.onContactClickListener = listener;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        String contact = contacts.get(position);
        holder.bind(contact);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView contactName;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            contactName = itemView.findViewById(android.R.id.text1);
            itemView.setOnClickListener(this);
        }

        public void bind(String contact) {
            contactName.setText(contact);
        }

        @Override
        public void onClick(View v) {
            onContactClickListener.onContactClick(contacts.get(getAdapterPosition()));
        }
    }
}