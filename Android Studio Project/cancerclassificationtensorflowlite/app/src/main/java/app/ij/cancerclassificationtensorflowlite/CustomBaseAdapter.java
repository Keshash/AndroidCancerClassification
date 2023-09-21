package app.ij.cancerclassificationtensorflowlite;

import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    String labelList[];
    String confidenceList[];
    LayoutInflater inflater;


    public CustomBaseAdapter(Context ctx, String [] labelList, String [] confidenceList) {
        this.context = ctx;
        this.labelList = labelList ;
        this.confidenceList = confidenceList;
        this.inflater = LayoutInflater.from(ctx);
    }
    public int getCount(){return labelList.length;}

    public Object getItem(int position){
        return null;
    }
    public long getItemId(int position){
        return 0;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView txtView = (TextView) convertView.findViewById(R.id.textViewItemLabel);
        TextView confView = (TextView) convertView.findViewById(R.id.textViewItemConfidence);
        txtView.setText(labelList[position]);
        confView.setText(confidenceList[position]);

        return convertView;
    }

}