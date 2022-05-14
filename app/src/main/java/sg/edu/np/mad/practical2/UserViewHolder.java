package sg.edu.np.mad.practical2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder{
    TextView username, description;
    ImageView image;

    public UserViewHolder(View item){
        super(item);

        username = item.findViewById(R.id.username);
        description = item.findViewById(R.id.description);
        image = item.findViewById(R.id.image2);
    }
}
