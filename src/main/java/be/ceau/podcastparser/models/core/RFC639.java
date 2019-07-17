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
package be.ceau.podcastparser.models.core;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.stream.Collectors;

public enum RFC639 {

	aa("Afar"),
	ab("Abkhazian"),
	ae("Avestan"),
	af("Afrikaans"),
	ak("Akan"),
	am("Amharic"),
	an("Aragonese"),
	ar("Arabic"),
	as("Assamese"),
	av("Avaric"),
	ay("Aymara"),
	az("Azerbaijani"),
	ba("Bashkir"),
	be("Belarusian"),
	bg("Bulgarian"),
	bh("Bihari"),
	bi("Bislama"),
	bm("Bambara"),
	bn("Bengali"),
	bo("Tibetan"),
	br("Breton"),
	bs("Bosnian"),
	ca("Catalan"),
	ce("Chechen"),
	ch("Chamorro"),
	co("Corsican"),
	cr("Cree"),
	cs("Czech"),
	cu("Church Slavic"),
	cv("Chuvash"),
	cy("Welsh"),
	da("Danish"),
	de("German"),
	dv("Divehi, Dhivehi, Maldivian"),
	dz("Dzongkha"),
	ee("Ewe"),
	el("Greek"),
	en("English"),
	eo("Esperanto"),
	es("Spanish"),
	et("Estonian"),
	eu("Basque"),
	fa("Persian"),
	ff("Fulah"),
	fi("Finnish"),
	fj("Fijian"),
	fo("Faroese"),
	fr("French"),
	fy("Western Frisian"),
	ga("Irish"),
	gd("Gaelic"),
	gl("Galician"),
	gn("Guaraní"),
	gu("Gujarati"),
	gv("Manx"),
	ha("Hausa"),
	he("Hebrew"),
	hi("Hindi"),
	ho("Hiri Motu"),
	hr("Croatian"),
	ht("Haitian"),
	hu("Hungarian"),
	hy("Armenian"),
	hz("Herero"),
	ia("Interlingua"),
	id("Indonesian"),
	ie("Interlingue"),
	ig("Igbo"),
	ii("Sichuan Yi"),
	ik("Inupiaq"),
	io("Ido"),
	is("Icelandic"),
	it("Italian"),
	iu("Inuktitut"),
	ja("Japanese"),
	jv("Javanese"),
	ka("Georgian"),
	kg("Kongo"),
	ki("Kikuyu, Gikuyu"),
	kj("Kuanyama, Kwanyama"),
	kk("Kazakh"),
	kl("Kalaallisut, Greenlandic"),
	km("Central Khmer"),
	kn("Kannada"),
	ko("Korean"),
	kr("Kanuri"),
	ks("Kashmiri"),
	ku("Kurdish"),
	kv("Komi"),
	kw("Cornish"),
	ky("Kirghiz, Kyrgyz"),
	la("Latin"),
	lb("Luxembourgish, Letzeburgesch"),
	lg("Ganda"),
	li("Limburgan, Limburger, Limburgish"),
	ln("Lingala"),
	lo("Lao"),
	lt("Lithuanian"),
	lu("Luba-Katanga"),
	lv("Latvian"),
	mg("Malagasy"),
	mh("Marshallese"),
	mi("Maori"),
	mk("Macedonian"),
	ml("Malayalam"),
	mn("Mongolian"),
	mr("Marathi"),
	ms("Malay"),
	mt("Maltese"),
	my("Burmese"),
	na("Nauru"),
	nb("Norwegian Bokmål"),
	nd("North Ndebele"),
	ne("Nepali"),
	ng("Ndonga"),
	nl("Dutch, Flemish"),
	nn("Norwegian Nynorsk"),
	no("Norwegian"),
	nr("South Ndebele"),
	nv("Navajo, Navaho"),
	ny("Chichewa, Chewa, Nyanja"),
	oc("Occitan"),
	oj("Ojibwa"),
	om("Oromo"),
	or("Oriya"),
	os("Ossetian, Ossetic"),
	pa("Panjabi, Punjabi"),
	pi("Pali"),
	pl("Polish"),
	ps("Pashto, Pushto"),
	pt("Portuguese"),
	qu("Quechua"),
	rm("Romansh"),
	rn("Rundi"),
	ro("Romanian, Moldavian, Moldovan"),
	ru("Russian"),
	rw("Kinyarwanda"),
	sa("Sanskrit"),
	sc("Sardinian"),
	sd("Sindhi"),
	se("Northern Sami"),
	sg("Sango"),
	si("Sinhala, Sinhalese"),
	sk("Slovak"),
	sl("Slovenian"),
	sm("Samoan"),
	sn("Shona"),
	so("Somali"),
	sq("Albanian"),
	sr("Serbian"),
	ss("Swati"),
	st("Southern Sotho"),
	su("Sundanese"),
	sv("Swedish"),
	sw("Swahili"),
	ta("Tamil"),
	te("Telugu"),
	tg("Tajik"),
	th("Thai"),
	ti("Tigrinya"),
	tk("Turkmen"),
	tl("Tagalog"),
	tn("Tswana"),
	to("Tonga"),
	tr("Turkish"),
	ts("Tsonga"),
	tt("Tatar"),
	tw("Twi"),
	ty("Tahitian"),
	ug("Uyghur"),
	uk("Ukrainian"),
	ur("Urdu"),
	uz("Uzbek"),
	ve("Venda"),
	vi("Vietnamese"),
	vo("Volapük"),
	wa("Walloon"),
	wo("Wolof"),
	xh("Xhosa"),
	yi("Yiddish"),
	yo("Yoruba"),
	za("Zhuang"),
	zh("Chinese"),
	zu("Zulu");

	public static final Set<RFC639> ALL = Collections.unmodifiableSet(EnumSet.allOf(RFC639.class));
	public static final Set<String> LANGUAGES = Collections.unmodifiableSet(ALL.stream().map(e -> e.name()).collect(Collectors.toSet()));

	private final String isoName;
	private RFC639(String isoName) {
		this.isoName = isoName;
	}
	public String getIsoName() {
		return isoName;
	}

}
