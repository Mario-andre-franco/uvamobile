package mario.spinner.facilita.uvamobile;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.spinner.facilita.uvamobile.R;

import java.util.HashMap;
import java.util.List;

public class ExpandableListAdapter3 extends BaseExpandableListAdapter {

    private Context _context3;
    private List<String> _listDataHeader3; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> _listDataChild3;

    public ExpandableListAdapter3(Context context, List<String> listDataHeader,
                                  HashMap<String, List<String>> listChildData) {
        this._context3 = context;
        this._listDataHeader3 = listDataHeader;
        this._listDataChild3= listChildData;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild3.get(this._listDataHeader3.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context3
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_item3, null);
        }


        TextView txtListChild = (TextView) convertView
                .findViewById(R.id.lblListItem3);

        txtListChild.setText(childText);
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild3.get(this._listDataHeader3.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader3.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader3.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context3
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_group3, null);
        }

        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader3);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}