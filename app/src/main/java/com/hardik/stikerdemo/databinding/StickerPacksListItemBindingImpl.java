package com.hardik.stikerdemo.databinding;
import com.hardik.stikerdemo.R;
import com.hardik.stikerdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StickerPacksListItemBindingImpl extends StickerPacksListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.sticker_pack_info, 4);
        sViewsWithIds.put(R.id.sticker_packs_list_item_image_list, 5);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public StickerPacksListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private StickerPacksListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.stickerCount.setTag(null);
        this.stickerPackTitle.setTag(null);
        this.stickerStoreRowContainer.setTag(null);
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
        if (BR.clickListenerPack == variableId) {
            setClickListenerPack((android.view.View.OnClickListener) variable);
        }
        else if (BR.stickerPack == variableId) {
            setStickerPack((com.hardik.stikerdemo.domainModel.StickerPack) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListenerPack(@Nullable android.view.View.OnClickListener ClickListenerPack) {
        this.mClickListenerPack = ClickListenerPack;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListenerPack);
        super.requestRebind();
    }
    public void setStickerPack(@Nullable com.hardik.stikerdemo.domainModel.StickerPack StickerPack) {
        this.mStickerPack = StickerPack;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.stickerPack);
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
        android.view.View.OnClickListener clickListenerPack = mClickListenerPack;
        java.lang.Integer stickerPackStickersCount = null;
        java.lang.String stickerPackName = null;
        com.hardik.stikerdemo.domainModel.StickerPack stickerPack = mStickerPack;
        java.lang.String stickerPackStickersCountToString = null;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (stickerPack != null) {
                    // read stickerPack.stickersCount
                    stickerPackStickersCount = stickerPack.getStickersCount();
                    // read stickerPack.name
                    stickerPackName = stickerPack.getName();
                }


                if (stickerPackStickersCount != null) {
                    // read stickerPack.stickersCount.toString()
                    stickerPackStickersCountToString = stickerPackStickersCount.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.stickerCount, stickerPackStickersCountToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.stickerPackTitle, stickerPackName);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.stickerStoreRowContainer.setOnClickListener(clickListenerPack);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListenerPack
        flag 1 (0x2L): stickerPack
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}