<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="body">



	<jsp:include page="/WEB-INF/views/includes/header.jsp" />

	<jsp:include page="/WEB-INF/views/includes/logo.jsp" />
		<div>
		
			<h1>New Reservation For (${subscriber.name})</h1>
			
			<%-- ?subscriberId=${subscriber.id} --%>
			<form:form name="newReservationForm" commandName="reservation" action="addReservationforPerson?subscriberId=${subscriber.id}" method="post">
				<jsp:include page="/WEB-INF/views/includes/reservation/reservationDetails.jsp" />
				<br/>
				
				<!-- <a href="reservationList">Back to list</a>&nbsp;&nbsp;&nbsp; -->
				<a href="javascript: document.forms.newReservationForm.submit();">Create new reservation</a>&nbsp;&nbsp;&nbsp; 
			</form:form>
			
			<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
		
		 </div>
</div>

	</tiles:putAttribute>
</tiles:insertDefinition>
