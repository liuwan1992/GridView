package com.liuwan.gridview.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.liuwan.gridview.R;
import com.liuwan.gridview.adapter.GridAdapter;

/**
 * Created by liuwan on 2016/9/24.
 */
public class QueryAnalysisFragment extends Fragment {

    private LinearLayout gridViewLayout;
    private GridView gridView;

    // 图标数组
    private int[] image = new int[]{R.drawable.load_query, R.drawable.energy_efficiency_query,
            R.drawable.equipment_query, R.drawable.power_quality_query,
            R.drawable.environment_query, R.drawable.coming_soon};
    // 文字数组
    private String[] text = new String[]{"负荷查询", "能效查询", "设备查询", "电能质量查询",
            "环境查询", "敬请期待"};

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gridViewLayout = (LinearLayout) getActivity().findViewById(R.id.gridViewLayout);
        gridView = (GridView) getActivity().findViewById(R.id.gridView);
        gridView.setAdapter(new GridAdapter(getActivity(), gridViewLayout, image, text));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_queryanalysis, container, false);
    }

}
