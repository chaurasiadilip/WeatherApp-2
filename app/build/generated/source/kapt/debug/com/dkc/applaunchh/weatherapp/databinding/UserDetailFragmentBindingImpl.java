package com.dkc.applaunchh.weatherapp.databinding;
import com.dkc.applaunchh.weatherapp.R;
import com.dkc.applaunchh.weatherapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UserDetailFragmentBindingImpl extends UserDetailFragmentBinding implements com.dkc.applaunchh.weatherapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_view, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener emailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.emailLiveData.getValue()
            //         is viewModel.emailLiveData.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(email);
            // localize variables for thread safety
            // viewModel.emailLiveData != null
            boolean viewModelEmailLiveDataJavaLangObjectNull = false;
            // viewModel.emailLiveData
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEmailLiveData = null;
            // viewModel.emailLiveData.getValue()
            java.lang.String viewModelEmailLiveDataGetValue = null;
            // viewModel
            com.dkc.applaunchh.weatherapp.userdetail.UserDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEmailLiveData = viewModel.getEmailLiveData();

                viewModelEmailLiveDataJavaLangObjectNull = (viewModelEmailLiveData) != (null);
                if (viewModelEmailLiveDataJavaLangObjectNull) {




                    viewModelEmailLiveData.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener lnameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.laslnameLiveData.getValue()
            //         is viewModel.laslnameLiveData.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(lname);
            // localize variables for thread safety
            // viewModel.laslnameLiveData != null
            boolean viewModelLaslnameLiveDataJavaLangObjectNull = false;
            // viewModel.laslnameLiveData
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLaslnameLiveData = null;
            // viewModel.laslnameLiveData.getValue()
            java.lang.String viewModelLaslnameLiveDataGetValue = null;
            // viewModel
            com.dkc.applaunchh.weatherapp.userdetail.UserDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelLaslnameLiveData = viewModel.getLaslnameLiveData();

                viewModelLaslnameLiveDataJavaLangObjectNull = (viewModelLaslnameLiveData) != (null);
                if (viewModelLaslnameLiveDataJavaLangObjectNull) {




                    viewModelLaslnameLiveData.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener usernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.firstNameLiveData.getValue()
            //         is viewModel.firstNameLiveData.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(username);
            // localize variables for thread safety
            // viewModel.firstNameLiveData.getValue()
            java.lang.String viewModelFirstNameLiveDataGetValue = null;
            // viewModel.firstNameLiveData != null
            boolean viewModelFirstNameLiveDataJavaLangObjectNull = false;
            // viewModel
            com.dkc.applaunchh.weatherapp.userdetail.UserDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.firstNameLiveData
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFirstNameLiveData = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelFirstNameLiveData = viewModel.getFirstNameLiveData();

                viewModelFirstNameLiveDataJavaLangObjectNull = (viewModelFirstNameLiveData) != (null);
                if (viewModelFirstNameLiveDataJavaLangObjectNull) {




                    viewModelFirstNameLiveData.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public UserDetailFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private UserDetailFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            );
        this.cancelButton.setTag(null);
        this.email.setTag(null);
        this.lname.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.save.setTag(null);
        this.texterror.setTag(null);
        this.username.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.dkc.applaunchh.weatherapp.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.dkc.applaunchh.weatherapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.dkc.applaunchh.weatherapp.userdetail.UserDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.dkc.applaunchh.weatherapp.userdetail.UserDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFirstNameLiveData((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelLaslnameLiveData((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelEmailLiveData((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFirstNameLiveData(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFirstNameLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLaslnameLiveData(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLaslnameLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmailLiveData(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEmailLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        java.lang.String viewModelEmailLiveDataGetValue = null;
        java.lang.String viewModelErrorGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFirstNameLiveData = null;
        java.lang.String viewModelFirstNameLiveDataGetValue = null;
        boolean viewModelErrorJavaLangObjectNull = false;
        int viewModelErrorJavaLangObjectNullViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLaslnameLiveData = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEmailLiveData = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelError = null;
        java.lang.String viewModelLaslnameLiveDataGetValue = null;
        com.dkc.applaunchh.weatherapp.userdetail.UserDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.firstNameLiveData
                        viewModelFirstNameLiveData = viewModel.getFirstNameLiveData();
                    }
                    updateLiveDataRegistration(0, viewModelFirstNameLiveData);


                    if (viewModelFirstNameLiveData != null) {
                        // read viewModel.firstNameLiveData.getValue()
                        viewModelFirstNameLiveDataGetValue = viewModelFirstNameLiveData.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.laslnameLiveData
                        viewModelLaslnameLiveData = viewModel.getLaslnameLiveData();
                    }
                    updateLiveDataRegistration(1, viewModelLaslnameLiveData);


                    if (viewModelLaslnameLiveData != null) {
                        // read viewModel.laslnameLiveData.getValue()
                        viewModelLaslnameLiveDataGetValue = viewModelLaslnameLiveData.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.emailLiveData
                        viewModelEmailLiveData = viewModel.getEmailLiveData();
                    }
                    updateLiveDataRegistration(2, viewModelEmailLiveData);


                    if (viewModelEmailLiveData != null) {
                        // read viewModel.emailLiveData.getValue()
                        viewModelEmailLiveDataGetValue = viewModelEmailLiveData.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.error
                        viewModelError = viewModel.getError();
                    }
                    updateLiveDataRegistration(3, viewModelError);


                    if (viewModelError != null) {
                        // read viewModel.error.getValue()
                        viewModelErrorGetValue = viewModelError.getValue();
                    }


                    // read viewModel.error.getValue() == null
                    viewModelErrorJavaLangObjectNull = (viewModelErrorGetValue) == (null);
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewModelErrorJavaLangObjectNull) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.error.getValue() == null ? View.GONE : View.VISIBLE
                    viewModelErrorJavaLangObjectNullViewGONEViewVISIBLE = ((viewModelErrorJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback3);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.email, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, emailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.lname, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, lnameandroidTextAttrChanged);
            this.save.setOnClickListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.username, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, usernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.email, viewModelEmailLiveDataGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lname, viewModelLaslnameLiveDataGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.texterror, viewModelErrorGetValue);
            this.texterror.setVisibility(viewModelErrorJavaLangObjectNullViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.username, viewModelFirstNameLiveDataGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.dkc.applaunchh.weatherapp.userdetail.UserDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onSaveUserAccount(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.dkc.applaunchh.weatherapp.userdetail.UserDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onCancel(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.firstNameLiveData
        flag 1 (0x2L): viewModel.laslnameLiveData
        flag 2 (0x3L): viewModel.emailLiveData
        flag 3 (0x4L): viewModel.error
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.error.getValue() == null ? View.GONE : View.VISIBLE
        flag 7 (0x8L): viewModel.error.getValue() == null ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}