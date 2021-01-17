package com.hardik.stikerdemo.databinding;
import com.hardik.stikerdemo.R;
import com.hardik.stikerdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewItemBindingImpl extends RecyclerViewItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rvNested, 3);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RecyclerViewItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCatTitle.setTag(null);
        this.tvMore.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.clickListenerMore == variableId) {
            setClickListenerMore((android.view.View.OnClickListener) variable);
        }
        else if (BR.categories == variableId) {
            setCategories((com.hardik.stikerdemo.domainModel.StickerCategory) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListenerMore(@Nullable android.view.View.OnClickListener ClickListenerMore) {
        this.mClickListenerMore = ClickListenerMore;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListenerMore);
        super.requestRebind();
    }
    public void setCategories(@Nullable com.hardik.stikerdemo.domainModel.StickerCategory Categories) {
        this.mCategories = Categories;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.categories);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String categoriesTitle = null;
        android.view.View.OnClickListener clickListenerMore = mClickListenerMore;
        com.hardik.stikerdemo.domainModel.StickerCategory categories = mCategories;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (categories != null) {
                    // read categories.title
                    categoriesTitle = categories.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCatTitle, categoriesTitle);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.tvMore.setOnClickListener(clickListenerMore);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListenerMore
        flag 1 (0x2L): categories
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}