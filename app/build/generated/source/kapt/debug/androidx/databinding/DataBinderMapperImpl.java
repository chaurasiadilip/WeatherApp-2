package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.dkc.applaunchh.weatherapp.DataBinderMapperImpl());
  }
}
