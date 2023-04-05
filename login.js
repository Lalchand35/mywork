// Get the form and input fields
const loginForm = document.querySelector('form');
const usernameInput = document.getElementById('username');
const passwordInput = document.getElementById('password');

// Add an event listener for form submission
loginForm.addEventListener('submit', function(event) {
	// Prevent the form from submitting if the fields are empty
	if (usernameInput.value === '' || passwordInput.value === '') {
		event.preventDefault();
		alert('Please enter your username and password.');
	}
});