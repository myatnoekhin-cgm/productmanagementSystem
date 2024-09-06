var ctx = document.getElementById('bookChart').getContext('2d');
var books = JSON.parse('${books}');

var bookTitles = books.map(function(book) {return book.title});
var bookPrices = books.map(function(book) {return book.price});

var bookChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: bookTitles,
        datasets: [{
            labels: 'BookPrices',
            data: bookPrices,
            backgroundColor: 'rgba(54,162,235,0.2)',
            borderColor:'rgba(54,162,235,1)',
            borderWidth: 1
        }]
    },
    options: {
    scales: {
        y: {
            beingAtZero: true
        }
    }
    }
});
