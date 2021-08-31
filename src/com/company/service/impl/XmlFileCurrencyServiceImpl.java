package com.company.service.impl;

import com.company.model.CurrencyModel;
import com.company.service.XmlFileCurrencyService;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

import static com.company.constants.Common.*;

public class XmlFileCurrencyServiceImpl implements XmlFileCurrencyService {
    @Override
    public List<CurrencyModel> fetchXmlFileCurrency() {
        try {
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
            DocumentBuilder b = f.newDocumentBuilder();
            Document doc = b.parse(XML_CBAR_URL);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName(VALUTE);
            List<CurrencyModel> currencyList = new ArrayList<>();
            for (int n = 0; n < nodeList.getLength(); n++) {
                Node node = nodeList.item(n);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    CurrencyModel currencyModel = new CurrencyModel();
                    Element element = (Element) node;
                    currencyModel.setValuteCode(element.getAttribute(CODE));
                    currencyModel.setNominal(element.getElementsByTagName(NOMINAL).item(0).getTextContent());
                    currencyModel.setName(element.getElementsByTagName(NAME).item(0).getTextContent());
                    currencyModel.setValue(Double.parseDouble(element.getElementsByTagName(VALUE).item(0).getTextContent()));
                    currencyList.add(currencyModel);

                }
            }

            return currencyList;
        } catch (Exception e) {
           throw new RuntimeException(e.getMessage());
        }
    }
}