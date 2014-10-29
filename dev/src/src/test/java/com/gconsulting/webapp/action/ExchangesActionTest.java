package com.gconsulting.webapp.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.gconsulting.model.Exchange;
import com.gconsulting.service.ExchangeManager;

public class ExchangesActionTest extends BasePageTestCase {

	private ExchangesAction bean;
	@Autowired
	@Qualifier("exchangeManager")
	private ExchangeManager exchangeManager;

	@Override
	@Before
	public void onSetUp() {

		super.onSetUp();
		bean = new ExchangesAction();
		bean.setExchangeManager(exchangeManager);

		// add a test person to the database
		Exchange exchange = new Exchange();
		exchange.setCode("TSTEXC");
		exchange.setName("Test Exchange");
		exchange.setDescription("This is a Test Exchange");
		exchangeManager.create(exchange);
	}

	@Override
	@After
	public void onTearDown() {
		super.onTearDown();
		bean = null;
	}

	@Test
	public void testSearch() throws Exception {
		assertTrue(bean.getExchanges().size() >= 1);
		assertFalse(bean.hasErrors());
	}

	@Test
	public void testAdd() throws Exception {

		Exchange exchange = new Exchange();
		exchange.setCode("TSTEXC2");
		exchange.setName("Test Exchange 2");
		exchange.setDescription("This is a Test Exchange");
		bean.setSelectedExchange(exchange);
		assertEquals("list", bean.save());
		assertFalse(bean.hasErrors());
	}

	@Test
	public void testEdit() throws Exception {

		log.debug("testing edit...");
		bean.setCode("TSTEXC");
		assertEquals("edit", bean.edit());
		assertNotNull(bean.getSelectedExchange());
		assertFalse(bean.hasErrors());
	}

	@Test
	public void testSave() {

		bean.setCode("TSTEXC");
		assertEquals("edit", bean.edit());
		assertNotNull(bean.getSelectedExchange());
		Exchange exchange = bean.getSelectedExchange();
		// update fields
		exchange.setCode("TSTEXC3");
		exchange.setName("Test Exchange 3");
		exchange.setDescription("This is a Test Exchange");
		bean.setSelectedExchange(exchange);
		assertEquals("edit", bean.save());
		assertFalse(bean.hasErrors());
	}

	@Test
	public void testRemove() throws Exception {

		Exchange exchange = new Exchange();
		exchange.setCode("TSTEXC");
		bean.setSelectedExchange(exchange);
		assertEquals("list", bean.delete());
		assertFalse(bean.hasErrors());
	}
}
