package com.hyundal;

import com.hankook.*;  // 한국타이어에서 가져온 타이어
import com.kumho.*;    // 금호타이어에서 가져온 타이어

public class Car {
	//Tire tire = new Tire(); // error -> 어떤 타이어에서 가지고 올 지 결정을 할 수 없어서...
		com.hankook.Tire tire1 = new com.hankook.Tire(); // 한국타이어에서 가지고 옴
		com.kumho.Tire tire2 = new com.kumho.Tire(); // 금호타이어에서 가지고 옴

}
