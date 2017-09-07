package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor				//필드기반 생성자 만들어줌
@NoArgsConstructor
public class Dept {

	int deptno;
	String dname;
	String loc;

}