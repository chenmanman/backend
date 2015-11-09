package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import model.Member;
import model.MemberExample;

public interface MemberService {
	
	public	String  GetMemberName(String id);

}
