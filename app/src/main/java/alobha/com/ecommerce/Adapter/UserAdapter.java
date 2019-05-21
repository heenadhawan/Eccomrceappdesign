package alobha.com.ecommerce.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import alobha.com.ecommerce.R;
import alobha.com.ecommerce.UserList;

/**
 * Created by Dell on 5/29/2018.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private List<UserList> userlist;
    private Context mcontext;

    public UserAdapter(Context mcontext, List<UserList> userlist) {
        this.mcontext=mcontext;
        this.userlist=userlist;


    }


    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.usersinglelayout, viewGroup, false);
        return new UserAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_name.setText((CharSequence) userlist.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return (userlist == null) ? 0 : userlist.size();
    }


/*
    public void addItem(String user) {
        userlist.add(user);
        notifyItemInserted(userlist.size());
    }
*/

    public void removeItem(int position) {
        userlist.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position,userlist.size());
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name,tv_email;
        public ViewHolder(View view) {
            super(view);

            tv_name = (TextView)view.findViewById(R.id.name);
            tv_email = (TextView)view.findViewById(R.id.email);

        }
    }

}
