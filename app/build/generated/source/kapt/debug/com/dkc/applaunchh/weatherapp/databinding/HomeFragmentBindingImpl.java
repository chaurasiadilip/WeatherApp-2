package com.dkc.applaunchh.weatherapp.databinding;
import com.dkc.applaunchh.weatherapp.R;
import com.dkc.applaunchh.weatherapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeFragmentBindingImpl extends HomeFragmentBinding implements com.dkc.applaunchh.weatherapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_view, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener lnameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.passwordLiveData.getValue()
            //         is viewModel.passwordLiveData.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(lname);
            // localize variables for thread safety
            // viewModel.passwordLiveData
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordLiveData = null;
            // viewModel.passwordLiveData != null
            boolean viewModelPasswordLiveDataJavaLangObjectNull = false;
            // viewModel.passwordLiveData.getValue()
            java.lang.String viewModelPasswordLiveDataGetValue = null;
            // viewModel
            com.dkc.applaunchh.weatherapp.login.LoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPasswordLiveData = viewModel.getPasswordLiveData();

                viewModelPasswordLiveDataJavaLangObjectNull = (viewModelPasswordLiveData) != (null);
                if (viewModelPasswordLiveDataJavaLangObjectNull) {




                    viewModelPasswordLiveData.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener usernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.emailLiveData.getValue()
            //         is viewModel.emailLiveData.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(username);
            // localize variables for thread safety
            // viewModel.emailLiveData != null
            boolean viewModelEmailLiveDataJavaLangObjectNull = false;
            // viewModel.emailLiveData
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEmailLiveData = null;
            // viewModel.emailLiveData.getValue()
            java.lang.String viewModelEmailLiveDataGetValue = null;
            // viewModel
            com.dkc.applaunchh.weatherapp.login.LoginViewModel viewModel = mViewModel;
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

    public HomeFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private HomeFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.cardview.widget.CardView) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            );
        this.lname.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.submit.setTag(null);
        this.texterror.setTag(null);
        this.username.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.dkc.applaunchh.weatherapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((com.dkc.applaunchh.weatherapp.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.dkc.applaunchh.weatherapp.login.LoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPasswordLiveData((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelEmailLiveData((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPasswordLiveData(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPasswordLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmailLiveData(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEmailLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordLiveData = null;
        java.lang.String viewModelEmailLiveDataGetValue = null;
        boolean viewModelErrorJavaLangObjectNull = false;
        int viewModelErrorJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String viewModelPasswordLiveDataGetValue = null;
        java.lang.String viewModelErrorGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEmailLiveData = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelError = null;
        com.dkc.applaunchh.weatherapp.login.LoginViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.passwordLiveData
                        viewModelPasswordLiveData = viewModel.getPasswordLiveData();
                    }
                    updateLiveDataRegistration(0, viewModelPasswordLiveData);


                    if (viewModelPasswordLiveData != null) {
                        // read viewModel.passwordLiveData.getValue()
                        viewModelPasswordLiveDataGetValue = viewModelPasswordLiveData.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.emailLiveData
                        viewModelEmailLiveData = viewModel.getEmailLiveData();
                    }
                    updateLiveDataRegistration(1, viewModelEmailLiveData);


                    if (viewModelEmailLiveData != null) {
                        // read viewModel.emailLiveData.getValue()
                        viewModelEmailLiveDataGetValue = viewModelEmailLiveData.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.error
                        viewModelError = viewModel.getError();
                    }
                    updateLiveDataRegistration(2, viewModelError);


                    if (viewModelError != null) {
                        // read viewModel.error.getValue()
                        viewModelErrorGetValue = viewModelError.getValue();
                    }


                    // read viewModel.error.getValue() == null
                    viewModelErrorJavaLangObjectNull = (viewModelErrorGetValue) == (null);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(viewModelErrorJavaLangObjectNull) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewModel.error.getValue() == null ? View.GONE : View.VISIBLE
                    viewModelErrorJavaLangObjectNullViewGONEViewVISIBLE = ((viewModelErrorJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lname, viewModelPasswordLiveDataGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.lname, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, lnameandroidTextAttrChanged);
            this.submit.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.username, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, usernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.texterror, viewModelErrorGetValue);
            this.texterror.setVisibility(viewModelErrorJavaLangObjectNullViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.username, viewModelEmailLiveDataGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.dkc.applaunchh.weatherapp.login.LoginViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.onSubmit(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.passwordLiveData
        flag 1 (0x2L): viewModel.emailLiveData
        flag 2 (0x3L): viewModel.error
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.error.getValue() == null ? View.GONE : View.VISIBLE
        flag 6 (0x7L): viewModel.error.getValue() == null ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}