package com.sunzn.decoration.library;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * ╔════════════════════════════════════════════════════════════════════════════════════════════════
 * ║ 类名：GridDecoration
 * ╟────────────────────────────────────────────────────────────────────────────────────────────────
 * ║ 参数：spanCount       纵向列数
 * ║ 参数：hSpacing        横向间距,单位px
 * ║ 参数：vSpacing        纵向间距,单位px
 * ║ 参数：includeEdge     边界是否增加间距
 * ╟────────────────────────────────────────────────────────────────────────────────────────────────
 * ║ 用法：recyclerView.addItemDecoration(new GridDecoration(spanCount, spacing, includeEdge));
 * ╚════════════════════════════════════════════════════════════════════════════════════════════════
 */
public class GridDecoration extends RecyclerView.ItemDecoration {

    private int spanCount;

    private int hSpacing;

    private int vSpacing;

    private boolean includeEdge;

    public GridDecoration(int spanCount, int spacing, boolean includeEdge) {
        this(spanCount, spacing, spacing, includeEdge);
    }

    public GridDecoration(int spanCount, int hSpacing, int vSpacing, boolean includeEdge) {
        this.spanCount = spanCount;
        this.hSpacing = hSpacing;
        this.vSpacing = vSpacing;
        this.includeEdge = includeEdge;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);
        int column = position % spanCount;
        if (includeEdge) {
            outRect.left = hSpacing - column * hSpacing / spanCount;
            outRect.right = (column + 1) * hSpacing / spanCount;
            if (position < spanCount) {
                outRect.top = vSpacing;
            }
            outRect.bottom = vSpacing;
        } else {
            outRect.left = column * hSpacing / spanCount;
            outRect.right = hSpacing - (column + 1) * hSpacing / spanCount;
            if (position >= spanCount) {
                outRect.top = vSpacing;
            }
        }
    }

}
