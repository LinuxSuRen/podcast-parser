/*
	Copyright 2017 Marceau Dewilde <m@ceau.be>
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
		https://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.podcastparser.namespace.impl;

import javax.xml.stream.XMLStreamException;

import org.slf4j.LoggerFactory;

import be.ceau.podcastparser.PodParseContext;
import be.ceau.podcastparser.models.Item;
import be.ceau.podcastparser.namespace.Namespace;
import be.ceau.podcastparser.util.Attributes;

/**
 * <h1>WGS84 Geo Positioning: an RDF vocabulary</h1>
 * <p>
 * A vocabulary for representing latitude, longitude and altitude information in
 * the WGS84 geodetic reference datum.
 * </p>
 */
public class Geo implements Namespace {

	private static final String NAME = "http://www.w3.org/2003/01/geo/wgs84_pos#";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void process(PodParseContext ctx) throws XMLStreamException {
		switch (ctx.getReader().getLocalName()) {
		case "long":
			LoggerFactory.getLogger(Namespace.class).info("Geo long --> {} {}", Attributes.toString(ctx.getReader()), ctx.getElementText());
			break;
		case "lat":
			LoggerFactory.getLogger(Namespace.class).info("Geo lat --> {} {}", Attributes.toString(ctx.getReader()), ctx.getElementText());
			break;
		}
	}

	@Override
	public void process(PodParseContext ctx, Item item) throws XMLStreamException {
		switch (ctx.getReader().getLocalName()) {
		case "long":
			LoggerFactory.getLogger(Namespace.class).info("Geo long --> {} {}", Attributes.toString(ctx.getReader()), ctx.getElementText());
			break;
		case "lat":
			LoggerFactory.getLogger(Namespace.class).info("Geo lat --> {} {}", Attributes.toString(ctx.getReader()), ctx.getElementText());
			break;
		case "Point":
			LoggerFactory.getLogger(Namespace.class).info("Geo Point --> {} {}", Attributes.toString(ctx.getReader()), ctx.getElementText());
			break;
		}
	}

}

/*

	corpus stats
	
      5143 	--> http://www.w3.org/2003/01/geo/wgs84_pos# level=item localName=long attributes=[]]
      4861 	--> http://www.w3.org/2003/01/geo/wgs84_pos# level=item localName=lat attributes=[]]
      1908 	--> http://www.w3.org/2003/01/geo/wgs84_pos# level=feed localName=long attributes=[]]
      1908 	--> http://www.w3.org/2003/01/geo/wgs84_pos# level=feed localName=lat attributes=[]]
        21 	--> http://www.w3.org/2003/01/geo/wgs84_pos# level=item localName=Point attributes=[]]

*/

