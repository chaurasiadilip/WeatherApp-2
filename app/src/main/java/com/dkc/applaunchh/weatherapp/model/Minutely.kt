package com.dkc.applaunchh.weatherapp.model

import com.google.gson.annotations.SerializedName

data class Minutely (

	@SerializedName("dt") val dt : Int,
	@SerializedName("precipitation") val precipitation : Int
)