package com.sunzn.decoration.library;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * ╔════════════════════════════════════════════════════════════════════════════════════════════════
 * ║ 类名：LineDecoration
 * ╟────────────────────────────────────────────────────────────────────────────────────────────────
 * ║ 参数：hSpacing        横向间距,单位px
 * ║ 参数：vSpacing        纵向间距,单位px
 * ╟────────────────────────────────────────────────────────────────────────────────────────────────
 * ║ 用法：recyclerView.addItemDecoration(new LineDecoration(hSpacing, vSpacing));
 * ╚════════════════════════════════════════════════════════════════════════════════════════════════
 */
public class LineDecoration extends RecyclerView.ItemDecoration {

    private int hSpacing;

    private int vSpacing;

    public LineDecoration(int spacing) {
        this(spacing, spacing);
    }

    public LineDecoration(int hSpacing, int vSpacing) {
        this.hSpacing = hSpacing < 0 ? 0 : hSpacing;
        this.vSpacing = vSpacing < 0 ? 0 : vSpacing;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = hSpacing;
        outRect.right = hSpacing;
        outRect.bottom = vSpacing;

        if (parent.getChildLayoutPosition(view) == 0) {
            outRect.top = vSpacing;
        } else {
            outRect.top = 0;
        }
    }
}
