package alobha.com.ecommerce;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import alobha.com.ecommerce.Adapter.CustomAdapter;
import alobha.com.ecommerce.Adapter.MyAdapter;
import me.relex.circleindicator.CircleIndicator;
/**
 * Created by Dell on 5/24/2018.
 */

public class HomeFragment  extends Fragment{
    private CustomAdapter horizontalAdapter;
    private ArrayList<Arraylist> horizontalList;
    private RecyclerView horizontal_recycler_view;
    private  ViewPager mPager;
    View view;
    CircleIndicator indicator;
    Context context;
    private static int currentPage = 0;
    private static final Integer[] XMEN= {R.drawable.shop1,R.drawable.shop2,R.drawable.shop3,R.drawable.shop4};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.activity_startprofile, null);
        context=this.getActivity();
        context = this.getActivity();
        init();

        return view;

    }

    private void init() {
        for (int i = 0; i < XMEN.length; i++)
            XMENArray.add(XMEN[i]);

        mPager = (ViewPager) view.findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter(getActivity(), XMENArray));
        indicator = view.findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == XMEN.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        horizontalList = new ArrayList<Arraylist>();
        for (int i = 0; i < MyData.nameArray.length; i++) {
            horizontalList.add(new Arraylist(
                    MyData.nameArray[i],
                    MyData.drawableArray[i]
            ));
            horizontal_recycler_view = (RecyclerView) view.findViewById(R.id.recylerview);
            horizontalAdapter = new CustomAdapter(horizontalList);
            LinearLayoutManager horizontalLayoutManagaer
                    = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);

            horizontal_recycler_view.setLayoutManager(horizontalLayoutManagaer);
            horizontal_recycler_view.setAdapter(horizontalAdapter);
        }

    }}