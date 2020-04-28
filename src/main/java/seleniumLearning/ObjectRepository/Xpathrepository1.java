package seleniumLearning.ObjectRepository;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xpathrepository1
{
	private static DocumentBuilderFactory dbFactory;
	private static DocumentBuilder dBuilder;
	private static Document doc;
	private static XPath xPath;
	private static NodeList nodeList;
	private static String locator;
	private static String expression;
	private static Node nNode; 

	

	public static String getLocator(String locatorvalue) 
	{	 
		
		try
		{
			expression = "/elements/element";
			dbFactory = DocumentBuilderFactory.newInstance();
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(new File(".//xml//Xpathto.xml"));
			doc.getDocumentElement().normalize();
			xPath = XPathFactory.newInstance().newXPath();
			nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
		}
		catch (ParserConfigurationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SAXException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (XPathExpressionException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < nodeList.getLength(); i++)
		{
			nNode = nodeList.item(i);
			// System.out.println("\nCurrent Element :"+ nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE)
			{
				Element eElement = (Element) nNode;
//				String attribute = eElement.getAttribute("name");
				// System.out.println("Tag Attriute : "+attribute);
//				if (attribute.equalsIgnoreCase(locatorvalue))
//				{
//					System.out.println("Tag name::" + nNode.getNodeName() + ":: Tag Attriute :: " + attribute);
					locator = eElement.getAttribute("locator");
					System.out.println("Tag name::" + nNode.getNodeName() + ":: Tag Attriute Value :: " + locator);

//				}

			}
		}

		return locator;

	}

	public static void main(String[] args) throws XPathExpressionException
	{

		String ff = getLocator("fge_username");
		//String locator = ff.replaceAll("userName", "Krishna");
		System.out.println(locator);
		System.out.println(ff);
	}

}
