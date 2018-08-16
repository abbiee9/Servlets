<%java.util.Map map = new java.util.HashMap();
request.setAttribute("map", map);
 map.put("a","b");
 map.put("b","c");
map.put("c","d");%>

<%-- 
 ${map.c}
 ${map[c]}
 ${map["c"]}
 ${map.map.b}
 ${map[map.b]}
 ${map.map(map.b)} --%>
 ${map[map.c]}
 