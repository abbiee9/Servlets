<%int[] nums = {42, 420, 4200};
request.setAttribute("foo", nums);%>
${5 + 3 lt 6}
${requestScope['foo'][0] ne 10 div 0}
${10 div 0}