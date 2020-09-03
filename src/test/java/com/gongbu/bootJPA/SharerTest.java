package com.gongbu.bootJPA;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gongbu.bootJPA.domain.Sharer;
import com.gongbu.bootJPA.service.SharerService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(classes=Application.class)
@SpringBootTest(classes=Application.class)
public class SharerTest {

	@Autowired
	private SharerService sharerService;

	@Test
	public void saveSharerTest() throws Exception {
		Sharer sharer = new Sharer();
	}
}
