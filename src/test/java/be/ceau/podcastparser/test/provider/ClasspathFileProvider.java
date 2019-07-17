/*
	Copyright 2019 Marceau Dewilde <m@ceau.be>
	
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
package be.ceau.podcastparser.test.provider;

import java.net.URL;

import be.ceau.podcastparser.test.wrappedxml.ClasspathXml;
import be.ceau.podcastparser.test.wrappedxml.EmptyXml;
import be.ceau.podcastparser.test.wrappedxml.WrappedXml;

public class ClasspathFileProvider {

	public static WrappedXml read(String filename) {
		URL url = ClasspathFileProvider.class.getResource(filename);
		if (url == null) {
			return EmptyXml.INSTANCE;
		}
		return ClasspathXml.instance(url);
	}

}
