package com.mustafabeyazyuz.basicviews.databinding;
import com.mustafabeyazyuz.basicviews.R;
import com.mustafabeyazyuz.basicviews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.mustafabeyazyuz.basicviews.generated.callback.OnCheckedChangeListener.Listener, com.mustafabeyazyuz.basicviews.generated.callback.OnItemSelected.Listener, com.mustafabeyazyuz.basicviews.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainActivityLayoutRegisterInfo, 18);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView10;
    @NonNull
    private final android.widget.Switch mboundView11;
    @NonNull
    private final android.widget.EditText mboundView12;
    @NonNull
    private final android.widget.Button mboundView13;
    @NonNull
    private final android.widget.CheckBox mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.Button mboundView16;
    @NonNull
    private final android.widget.Button mboundView17;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.Spinner mboundView4;
    @NonNull
    private final android.widget.Spinner mboundView5;
    @NonNull
    private final android.widget.Spinner mboundView6;
    @NonNull
    private final android.widget.Spinner mboundView7;
    @NonNull
    private final android.widget.EditText mboundView8;
    @NonNull
    private final android.widget.EditText mboundView9;
    // variables
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback6;
    @Nullable
    private final androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mainActivityEditTextNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerInfoViewModel.name
            //         is registerInfoViewModel.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mainActivityEditTextName);
            // localize variables for thread safety
            // registerInfoViewModel.name
            java.lang.String registerInfoViewModelName = null;
            // registerInfoViewModel
            org.csystem.android.app.basicviews.viewmodel.RegisterInfo registerInfoViewModel = mRegisterInfoViewModel;
            // registerInfoViewModel != null
            boolean registerInfoViewModelJavaLangObjectNull = false;



            registerInfoViewModelJavaLangObjectNull = (registerInfoViewModel) != (null);
            if (registerInfoViewModelJavaLangObjectNull) {




                registerInfoViewModel.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView11androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of allowShowPasswordChecked
            //         is com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setAllowShowPasswordChecked(callbackArg_0)
            boolean callbackArg_0 = mboundView11.isChecked();
            // localize variables for thread safety
            // allowShowPasswordChecked
            boolean allowShowPasswordChecked = mAllowShowPasswordChecked;


            if ((com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this) != (null)) {



                com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setAllowShowPasswordChecked(callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of confirmPassword
            //         is com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setConfirmPassword(callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
            // localize variables for thread safety
            // confirmPassword
            java.lang.String confirmPassword = mConfirmPassword;


            if ((com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this) != (null)) {



                com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setConfirmPassword(callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView14androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of accept
            //         is com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setAccept(callbackArg_0)
            boolean callbackArg_0 = mboundView14.isChecked();
            // localize variables for thread safety
            // accept
            boolean accept = mAccept;


            if ((com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this) != (null)) {



                com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setAccept(callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerInfoViewModel.email
            //         is registerInfoViewModel.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // registerInfoViewModel
            org.csystem.android.app.basicviews.viewmodel.RegisterInfo registerInfoViewModel = mRegisterInfoViewModel;
            // registerInfoViewModel.email
            java.lang.String registerInfoViewModelEmail = null;
            // registerInfoViewModel != null
            boolean registerInfoViewModelJavaLangObjectNull = false;



            registerInfoViewModelJavaLangObjectNull = (registerInfoViewModel) != (null);
            if (registerInfoViewModelJavaLangObjectNull) {




                registerInfoViewModel.setEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of dayPos
            //         is com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setDayPos(callbackArg_0)
            int callbackArg_0 = mboundView4.getSelectedItemPosition();
            // localize variables for thread safety
            // dayPos
            int dayPos = mDayPos;


            if ((com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this) != (null)) {



                com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setDayPos(callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of monthPos
            //         is com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setMonthPos(callbackArg_0)
            int callbackArg_0 = mboundView5.getSelectedItemPosition();
            // localize variables for thread safety
            // monthPos
            int monthPos = mMonthPos;


            if ((com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this) != (null)) {



                com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setMonthPos(callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of yearPos
            //         is com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setYearPos(callbackArg_0)
            int callbackArg_0 = mboundView6.getSelectedItemPosition();
            // localize variables for thread safety
            // yearPos
            int yearPos = mYearPos;


            if ((com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this) != (null)) {



                com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setYearPos(callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7androidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of educationSelectedPos
            //         is com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setEducationSelectedPos(callbackArg_0)
            int callbackArg_0 = mboundView7.getSelectedItemPosition();
            // localize variables for thread safety
            // educationSelectedPos
            int educationSelectedPos = mEducationSelectedPos;


            if ((com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this) != (null)) {



                com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setEducationSelectedPos(callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerInfoViewModel.userName
            //         is registerInfoViewModel.setUserName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // registerInfoViewModel.userName
            java.lang.String registerInfoViewModelUserName = null;
            // registerInfoViewModel
            org.csystem.android.app.basicviews.viewmodel.RegisterInfo registerInfoViewModel = mRegisterInfoViewModel;
            // registerInfoViewModel != null
            boolean registerInfoViewModelJavaLangObjectNull = false;



            registerInfoViewModelJavaLangObjectNull = (registerInfoViewModel) != (null);
            if (registerInfoViewModelJavaLangObjectNull) {




                registerInfoViewModel.setUserName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of password
            //         is com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setPassword(callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // password
            java.lang.String password = mPassword;


            if ((com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this) != (null)) {



                com.mustafabeyazyuz.basicviews.databinding.ActivityMainBindingImpl.this.setPassword(callbackArg_0);
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[2]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.ToggleButton) bindings[1]
            );
        this.mainActivityEditTextName.setTag(null);
        this.mainActivityToggleButtonOpen.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.Button) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.Switch) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.EditText) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.Button) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.CheckBox) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.Button) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.widget.Button) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Spinner) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Spinner) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.Spinner) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.Spinner) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.EditText) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.EditText) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.mustafabeyazyuz.basicviews.generated.callback.OnCheckedChangeListener(this, 6);
        mCallback2 = new com.mustafabeyazyuz.basicviews.generated.callback.OnItemSelected(this, 2);
        mCallback9 = new com.mustafabeyazyuz.basicviews.generated.callback.OnClickListener(this, 9);
        mCallback5 = new com.mustafabeyazyuz.basicviews.generated.callback.OnClickListener(this, 5);
        mCallback1 = new com.mustafabeyazyuz.basicviews.generated.callback.OnCheckedChangeListener(this, 1);
        mCallback8 = new com.mustafabeyazyuz.basicviews.generated.callback.OnClickListener(this, 8);
        mCallback4 = new com.mustafabeyazyuz.basicviews.generated.callback.OnItemSelected(this, 4);
        mCallback7 = new com.mustafabeyazyuz.basicviews.generated.callback.OnClickListener(this, 7);
        mCallback3 = new com.mustafabeyazyuz.basicviews.generated.callback.OnItemSelected(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40000L;
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
        if (BR.monthAdapter == variableId) {
            setMonthAdapter((android.widget.ArrayAdapter<java.lang.String>) variable);
        }
        else if (BR.educationAdapter == variableId) {
            setEducationAdapter((android.widget.ArrayAdapter<java.lang.String>) variable);
        }
        else if (BR.yearAdapter == variableId) {
            setYearAdapter((android.widget.ArrayAdapter<java.lang.Integer>) variable);
        }
        else if (BR.passwordInputType == variableId) {
            setPasswordInputType((int) variable);
        }
        else if (BR.password == variableId) {
            setPassword((java.lang.String) variable);
        }
        else if (BR.yearPos == variableId) {
            setYearPos((int) variable);
        }
        else if (BR.show == variableId) {
            setShow((java.lang.Object) variable);
        }
        else if (BR.accept == variableId) {
            setAccept((boolean) variable);
        }
        else if (BR.dayPos == variableId) {
            setDayPos((int) variable);
        }
        else if (BR.monthPos == variableId) {
            setMonthPos((int) variable);
        }
        else if (BR.result == variableId) {
            setResult((java.lang.String) variable);
        }
        else if (BR.allowShowPasswordChecked == variableId) {
            setAllowShowPasswordChecked((boolean) variable);
        }
        else if (BR.confirmPassword == variableId) {
            setConfirmPassword((java.lang.String) variable);
        }
        else if (BR.showPasswordButtonText == variableId) {
            setShowPasswordButtonText((java.lang.String) variable);
        }
        else if (BR.dayAdapter == variableId) {
            setDayAdapter((android.widget.ArrayAdapter<java.lang.Integer>) variable);
        }
        else if (BR.registerInfoViewModel == variableId) {
            setRegisterInfoViewModel((org.csystem.android.app.basicviews.viewmodel.RegisterInfo) variable);
        }
        else if (BR.mainActivityViewModel == variableId) {
            setMainActivityViewModel((org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel) variable);
        }
        else if (BR.educationSelectedPos == variableId) {
            setEducationSelectedPos((int) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMonthAdapter(@Nullable android.widget.ArrayAdapter<java.lang.String> MonthAdapter) {
        this.mMonthAdapter = MonthAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.monthAdapter);
        super.requestRebind();
    }
    public void setEducationAdapter(@Nullable android.widget.ArrayAdapter<java.lang.String> EducationAdapter) {
        this.mEducationAdapter = EducationAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.educationAdapter);
        super.requestRebind();
    }
    public void setYearAdapter(@Nullable android.widget.ArrayAdapter<java.lang.Integer> YearAdapter) {
        this.mYearAdapter = YearAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.yearAdapter);
        super.requestRebind();
    }
    public void setPasswordInputType(int PasswordInputType) {
        this.mPasswordInputType = PasswordInputType;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.passwordInputType);
        super.requestRebind();
    }
    public void setPassword(@Nullable java.lang.String Password) {
        this.mPassword = Password;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.password);
        super.requestRebind();
    }
    public void setYearPos(int YearPos) {
        this.mYearPos = YearPos;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.yearPos);
        super.requestRebind();
    }
    public void setShow(@Nullable java.lang.Object Show) {
        this.mShow = Show;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.show);
        super.requestRebind();
    }
    public void setAccept(boolean Accept) {
        this.mAccept = Accept;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.accept);
        super.requestRebind();
    }
    public void setDayPos(int DayPos) {
        this.mDayPos = DayPos;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.dayPos);
        super.requestRebind();
    }
    public void setMonthPos(int MonthPos) {
        this.mMonthPos = MonthPos;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.monthPos);
        super.requestRebind();
    }
    public void setResult(@Nullable java.lang.String Result) {
        this.mResult = Result;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.result);
        super.requestRebind();
    }
    public void setAllowShowPasswordChecked(boolean AllowShowPasswordChecked) {
        this.mAllowShowPasswordChecked = AllowShowPasswordChecked;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.allowShowPasswordChecked);
        super.requestRebind();
    }
    public void setConfirmPassword(@Nullable java.lang.String ConfirmPassword) {
        this.mConfirmPassword = ConfirmPassword;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.confirmPassword);
        super.requestRebind();
    }
    public void setShowPasswordButtonText(@Nullable java.lang.String ShowPasswordButtonText) {
        this.mShowPasswordButtonText = ShowPasswordButtonText;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.showPasswordButtonText);
        super.requestRebind();
    }
    public void setDayAdapter(@Nullable android.widget.ArrayAdapter<java.lang.Integer> DayAdapter) {
        this.mDayAdapter = DayAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.dayAdapter);
        super.requestRebind();
    }
    public void setRegisterInfoViewModel(@Nullable org.csystem.android.app.basicviews.viewmodel.RegisterInfo RegisterInfoViewModel) {
        this.mRegisterInfoViewModel = RegisterInfoViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.registerInfoViewModel);
        super.requestRebind();
    }
    public void setMainActivityViewModel(@Nullable org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel MainActivityViewModel) {
        this.mMainActivityViewModel = MainActivityViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.mainActivityViewModel);
        super.requestRebind();
    }
    public void setEducationSelectedPos(int EducationSelectedPos) {
        this.mEducationSelectedPos = EducationSelectedPos;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.educationSelectedPos);
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
        java.lang.String registerInfoViewModelUserName = null;
        android.widget.ArrayAdapter<java.lang.String> monthAdapter = mMonthAdapter;
        android.widget.ArrayAdapter<java.lang.String> educationAdapter = mEducationAdapter;
        android.widget.ArrayAdapter<java.lang.Integer> yearAdapter = mYearAdapter;
        int passwordInputType = mPasswordInputType;
        java.lang.String password = mPassword;
        int yearPos = mYearPos;
        java.lang.Object show = mShow;
        boolean accept = mAccept;
        int dayPos = mDayPos;
        int monthPos = mMonthPos;
        java.lang.String result = mResult;
        boolean allowShowPasswordChecked = mAllowShowPasswordChecked;
        java.lang.String confirmPassword = mConfirmPassword;
        java.lang.String showPasswordButtonText = mShowPasswordButtonText;
        android.widget.ArrayAdapter<java.lang.Integer> dayAdapter = mDayAdapter;
        java.lang.String registerInfoViewModelName = null;
        org.csystem.android.app.basicviews.viewmodel.RegisterInfo registerInfoViewModel = mRegisterInfoViewModel;
        org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel mainActivityViewModel = mMainActivityViewModel;
        java.lang.String registerInfoViewModelEmail = null;
        int educationSelectedPos = mEducationSelectedPos;

        if ((dirtyFlags & 0x40201L) != 0) {
        }
        if ((dirtyFlags & 0x60002L) != 0) {
        }
        if ((dirtyFlags & 0x40024L) != 0) {
        }
        if ((dirtyFlags & 0x40008L) != 0) {
        }
        if ((dirtyFlags & 0x40010L) != 0) {
        }
        if ((dirtyFlags & 0x40040L) != 0) {
        }
        if ((dirtyFlags & 0x40080L) != 0) {
        }
        if ((dirtyFlags & 0x44100L) != 0) {
        }
        if ((dirtyFlags & 0x40400L) != 0) {
        }
        if ((dirtyFlags & 0x40800L) != 0) {
        }
        if ((dirtyFlags & 0x41000L) != 0) {
        }
        if ((dirtyFlags & 0x42000L) != 0) {
        }
        if ((dirtyFlags & 0x48000L) != 0) {



                if (registerInfoViewModel != null) {
                    // read registerInfoViewModel.userName
                    registerInfoViewModelUserName = registerInfoViewModel.getUserName();
                    // read registerInfoViewModel.name
                    registerInfoViewModelName = registerInfoViewModel.getName();
                    // read registerInfoViewModel.email
                    registerInfoViewModelEmail = registerInfoViewModel.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x48000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mainActivityEditTextName, registerInfoViewModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, registerInfoViewModelEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, registerInfoViewModelUserName);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mainActivityEditTextName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mainActivityEditTextNameandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mainActivityToggleButtonOpen, mCallback1, (androidx.databinding.InverseBindingListener)null);
            this.mboundView10.setOnClickListener(mCallback5);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView11, mCallback6, mboundView11androidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            this.mboundView13.setOnClickListener(mCallback7);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView14, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView14androidCheckedAttrChanged);
            this.mboundView16.setOnClickListener(mCallback8);
            this.mboundView17.setOnClickListener(mCallback9);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.mboundView4, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected)null, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, mboundView4androidSelectedItemPositionAttrChanged);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.mboundView5, mCallback2, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, mboundView5androidSelectedItemPositionAttrChanged);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.mboundView6, mCallback3, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, mboundView6androidSelectedItemPositionAttrChanged);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.mboundView7, mCallback4, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, mboundView7androidSelectedItemPositionAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x40040L) != 0) {
            // api target 1

            this.mboundView10.setTag((java.lang.Object) show);
        }
        if ((dirtyFlags & 0x40800L) != 0) {
            // api target 1

            this.mboundView10.setEnabled(allowShowPasswordChecked);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView11, allowShowPasswordChecked);
        }
        if ((dirtyFlags & 0x42000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, showPasswordButtonText);
        }
        if ((dirtyFlags & 0x41000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, confirmPassword);
        }
        if ((dirtyFlags & 0x40080L) != 0) {
            // api target 1

            this.mboundView13.setEnabled(accept);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView14, accept);
        }
        if ((dirtyFlags & 0x40400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, result);
        }
        if ((dirtyFlags & 0x44100L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.mboundView4, dayPos, dayAdapter);
        }
        if ((dirtyFlags & 0x40201L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.mboundView5, monthPos, monthAdapter);
        }
        if ((dirtyFlags & 0x40024L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.mboundView6, yearPos, yearAdapter);
        }
        if ((dirtyFlags & 0x60002L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.mboundView7, educationSelectedPos, educationAdapter);
        }
        if ((dirtyFlags & 0x40008L) != 0) {
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.mboundView9.setInputType(passwordInputType);
            }
        }
        if ((dirtyFlags & 0x40010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, password);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // mainActivityViewModel.handleAllowShowPasswordSwitch(checked)
                kotlin.Unit mainActivityViewModelHandleAllowShowPasswordSwitchCallbackArg1 = null;
                // mainActivityViewModel != null
                boolean mainActivityViewModelJavaLangObjectNull = false;
                // mainActivityViewModel
                org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel mainActivityViewModel = mMainActivityViewModel;



                mainActivityViewModelJavaLangObjectNull = (mainActivityViewModel) != (null);
                if (mainActivityViewModelJavaLangObjectNull) {



                    mainActivityViewModelHandleAllowShowPasswordSwitchCallbackArg1 = mainActivityViewModel.handleAllowShowPasswordSwitch(callbackArg_1);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // mainActivityViewModel != null
                boolean mainActivityViewModelJavaLangObjectNull = false;
                // mainActivityViewModel
                org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel mainActivityViewModel = mMainActivityViewModel;
                // mainActivityViewModel.handleOpenToggleButton(checked)
                kotlin.Unit mainActivityViewModelHandleOpenToggleButtonCallbackArg1 = null;



                mainActivityViewModelJavaLangObjectNull = (mainActivityViewModel) != (null);
                if (mainActivityViewModelJavaLangObjectNull) {



                    mainActivityViewModelHandleOpenToggleButtonCallbackArg1 = mainActivityViewModel.handleOpenToggleButton(callbackArg_1);
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnItemSelected(int sourceId , android.widget.AdapterView callbackArg_0, android.view.View callbackArg_1, int callbackArg_2, long callbackArg_3) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // mainActivityViewModel != null
                boolean mainActivityViewModelJavaLangObjectNull = false;
                // mainActivityViewModel
                org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel mainActivityViewModel = mMainActivityViewModel;
                // mainActivityViewModel.handleBirthDateMonthSpinner(pos)
                kotlin.Unit mainActivityViewModelHandleBirthDateMonthSpinnerCallbackArg2 = null;



                mainActivityViewModelJavaLangObjectNull = (mainActivityViewModel) != (null);
                if (mainActivityViewModelJavaLangObjectNull) {



                    mainActivityViewModelHandleBirthDateMonthSpinnerCallbackArg2 = mainActivityViewModel.handleBirthDateMonthSpinner(callbackArg_2);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // mainActivityViewModel != null
                boolean mainActivityViewModelJavaLangObjectNull = false;
                // mainActivityViewModel
                org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel mainActivityViewModel = mMainActivityViewModel;
                // mainActivityViewModel.handleEducationSpinner(pos)
                kotlin.Unit mainActivityViewModelHandleEducationSpinnerCallbackArg2 = null;



                mainActivityViewModelJavaLangObjectNull = (mainActivityViewModel) != (null);
                if (mainActivityViewModelJavaLangObjectNull) {



                    mainActivityViewModelHandleEducationSpinnerCallbackArg2 = mainActivityViewModel.handleEducationSpinner(callbackArg_2);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // mainActivityViewModel.handleBirthDateYearSpinner(pos)
                kotlin.Unit mainActivityViewModelHandleBirthDateYearSpinnerCallbackArg2 = null;
                // mainActivityViewModel != null
                boolean mainActivityViewModelJavaLangObjectNull = false;
                // mainActivityViewModel
                org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel mainActivityViewModel = mMainActivityViewModel;



                mainActivityViewModelJavaLangObjectNull = (mainActivityViewModel) != (null);
                if (mainActivityViewModelJavaLangObjectNull) {



                    mainActivityViewModelHandleBirthDateYearSpinnerCallbackArg2 = mainActivityViewModel.handleBirthDateYearSpinner(callbackArg_2);
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 9: {
                // localize variables for thread safety
                // mainActivityViewModel.handleCloseButton()
                kotlin.Unit mainActivityViewModelHandleCloseButton = null;
                // mainActivityViewModel != null
                boolean mainActivityViewModelJavaLangObjectNull = false;
                // mainActivityViewModel
                org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel mainActivityViewModel = mMainActivityViewModel;



                mainActivityViewModelJavaLangObjectNull = (mainActivityViewModel) != (null);
                if (mainActivityViewModelJavaLangObjectNull) {


                    mainActivityViewModelHandleCloseButton = mainActivityViewModel.handleCloseButton();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // mainActivityViewModel != null
                boolean mainActivityViewModelJavaLangObjectNull = false;
                // mainActivityViewModel
                org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel mainActivityViewModel = mMainActivityViewModel;
                // mainActivityViewModel.handleShowPasswordButton()
                kotlin.Unit mainActivityViewModelHandleShowPasswordButton = null;



                mainActivityViewModelJavaLangObjectNull = (mainActivityViewModel) != (null);
                if (mainActivityViewModelJavaLangObjectNull) {


                    mainActivityViewModelHandleShowPasswordButton = mainActivityViewModel.handleShowPasswordButton();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // mainActivityViewModel != null
                boolean mainActivityViewModelJavaLangObjectNull = false;
                // mainActivityViewModel
                org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel mainActivityViewModel = mMainActivityViewModel;
                // mainActivityViewModel.handleClearButton()
                kotlin.Unit mainActivityViewModelHandleClearButton = null;



                mainActivityViewModelJavaLangObjectNull = (mainActivityViewModel) != (null);
                if (mainActivityViewModelJavaLangObjectNull) {


                    mainActivityViewModelHandleClearButton = mainActivityViewModel.handleClearButton();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // mainActivityViewModel != null
                boolean mainActivityViewModelJavaLangObjectNull = false;
                // mainActivityViewModel
                org.csystem.android.app.basicviews.viewmodel.MainActivityListenersViewModel mainActivityViewModel = mMainActivityViewModel;
                // mainActivityViewModel.handleRegisterButton()
                kotlin.Unit mainActivityViewModelHandleRegisterButton = null;



                mainActivityViewModelJavaLangObjectNull = (mainActivityViewModel) != (null);
                if (mainActivityViewModelJavaLangObjectNull) {


                    mainActivityViewModelHandleRegisterButton = mainActivityViewModel.handleRegisterButton();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): monthAdapter
        flag 1 (0x2L): educationAdapter
        flag 2 (0x3L): yearAdapter
        flag 3 (0x4L): passwordInputType
        flag 4 (0x5L): password
        flag 5 (0x6L): yearPos
        flag 6 (0x7L): show
        flag 7 (0x8L): accept
        flag 8 (0x9L): dayPos
        flag 9 (0xaL): monthPos
        flag 10 (0xbL): result
        flag 11 (0xcL): allowShowPasswordChecked
        flag 12 (0xdL): confirmPassword
        flag 13 (0xeL): showPasswordButtonText
        flag 14 (0xfL): dayAdapter
        flag 15 (0x10L): registerInfoViewModel
        flag 16 (0x11L): mainActivityViewModel
        flag 17 (0x12L): educationSelectedPos
        flag 18 (0x13L): null
    flag mapping end*/
    //end
}