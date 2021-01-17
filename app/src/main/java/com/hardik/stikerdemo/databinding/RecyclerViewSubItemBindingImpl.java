package com.hardik.stikerdemo.databinding;
import com.hardik.stikerdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewSubItemBindingImpl extends RecyclerViewSubItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewSubItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RecyclerViewSubItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.imageView.setTag(null);
        this.imageView2.setTag(null);
        this.imageView3.setTag(null);
        this.imageView4.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvPeakTitle.setTag(null);
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
        java.lang.String stickerPackPreviewImagesGetInt1 = null;
        java.lang.String stickerPackPreviewImagesGetInt3 = null;
        java.lang.String stickerPackPreviewImagesGetInt0 = null;
        java.util.List<java.lang.String> stickerPackPreviewImages = null;
        java.lang.String stickerPackPreviewImagesGetInt2 = null;
        java.lang.String stickerPackIdentifier = null;
        com.hardik.stikerdemo.domainModel.StickerPack stickerPack = mStickerPack;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (stickerPack != null) {
                    // read stickerPack.previewImages
                    stickerPackPreviewImages = stickerPack.getPreviewImages();
                    // read stickerPack.identifier
                    stickerPackIdentifier = stickerPack.getIdentifier();
                }


                if (stickerPackPreviewImages != null) {
                    // read stickerPack.previewImages.get(1)
                    stickerPackPreviewImagesGetInt1 = stickerPackPreviewImages.get(1);
                    // read stickerPack.previewImages.get(3)
                    stickerPackPreviewImagesGetInt3 = stickerPackPreviewImages.get(3);
                    // read stickerPack.previewImages.get(0)
                    stickerPackPreviewImagesGetInt0 = stickerPackPreviewImages.get(0);
                    // read stickerPack.previewImages.get(2)
                    stickerPackPreviewImagesGetInt2 = stickerPackPreviewImages.get(2);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.hardik.stikerdemo.adapter.SubCatBindingAdapterKt.loadIamge(this.imageView, stickerPackPreviewImagesGetInt0);
            com.hardik.stikerdemo.adapter.SubCatBindingAdapterKt.loadIamge(this.imageView2, stickerPackPreviewImagesGetInt1);
            com.hardik.stikerdemo.adapter.SubCatBindingAdapterKt.loadIamge(this.imageView3, stickerPackPreviewImagesGetInt2);
            com.hardik.stikerdemo.adapter.SubCatBindingAdapterKt.loadIamge(this.imageView4, stickerPackPreviewImagesGetInt3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPeakTitle, stickerPackIdentifier);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListenerPack);
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