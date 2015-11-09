package service.serviceimpl;


import org.apache.commons.codec.digest.DigestUtils;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import service.MemberService;
import dao.MemberMapper;

@Service("memberService")
public class MemberServiceImpl  implements MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public String GetMemberName(String id){
		String ss=memberMapper.getmembername(id);		
		return ss;
	}
	

	
}
