/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unikernel.lnu.ai.agents;

import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;
import org.unikernel.lnu.ai.graph.Vertex;

/**
 *
 * @author mcangel
 */
public class AlgorithmTest
{
	public AlgorithmTest()
	{
	}

	@BeforeClass
	public static void setUpClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownClass() throws Exception
	{
	}
	
	@Before
	public void setUp()
	{
	}
	
	@After
	public void tearDown()
	{
	}

	/**
	 * Test of setStartVertex method, of class Algorithm.
	 */
	@Test
	public void testSetStartVertex()
	{
		System.out.println("setStartVertex");
		Vertex startVertex = null;
		Algorithm instance = null;
		instance.setStartVertex(startVertex);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setEndVertex method, of class Algorithm.
	 */
	@Test
	public void testSetEndVertex()
	{
		System.out.println("setEndVertex");
		Vertex endVertex = null;
		Algorithm instance = null;
		instance.setEndVertex(endVertex);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of step method, of class Algorithm.
	 */
	@Test
	public void testStep()
	{
		System.out.println("step");
		Algorithm instance = null;
		Vertex[] expResult = null;
		Vertex[] result = instance.step();
		assertArrayEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of search method, of class Algorithm.
	 */
	@Test
	public void testSearch()
	{
		System.out.println("search");
		Algorithm instance = null;
		Collection<Vertex> expResult = null;
		Collection<Vertex> result = instance.search();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	public class AlgorithmImpl extends Algorithm
	{
		public AlgorithmImpl()
		{
			super(null);
		}

		@Override
		public Vertex[] step()
		{
			return null;
		}

		@Override
		public Collection<Vertex> search()
		{
			return null;
		}
	}
}