package dzuchun.android.testmap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mapbox.mapboxsdk.Mapbox;

public class MainActivityViewModel extends ViewModel {
    public MutableLiveData<Boolean> seletingUserLocation = new MutableLiveData<Boolean>();
    public MutableLiveData<Boolean> seletingTargetLocation = new MutableLiveData<Boolean>();

    public MainActivityViewModel(){
        
    }
}
