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

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import be.ceau.podcastparser.test.wrappedxml.FileXml;
import be.ceau.podcastparser.test.wrappedxml.WrappedXml;

public class FileProvider implements TestXmlProvider {

	private static final Path BASE_DIRECTORY = Paths.get(System.getProperty("user.home"), "podcastxml", "samples");

	private final WrappedXml wrappedXml;
	
	public FileProvider(String name) {
		File file = BASE_DIRECTORY.resolve(name).toFile();
		if (!file.isFile()) {
			throw new IllegalStateException(
					"no file named " + name + " in directory " + BASE_DIRECTORY.toString());
		}
		this.wrappedXml = FileXml.instance(file);
	}

	public WrappedXml get() {
		return wrappedXml;
	}

}
