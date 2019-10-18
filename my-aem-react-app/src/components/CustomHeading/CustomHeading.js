import React, {Component} from 'react';
import {MapTo} from '@adobe/cq-react-editable-components';
require('./CustomHeading.scss');

const CustomHeadingEditConfig = {
    emptyLabel: 'Custom Heading',
    isEmpty: function(props) {
        return !props.heading || props.heading.trim().length < 1;
    }
};

export default class CustomHeading extends Component {
    render() {
      let headingElement = this.props.headingType ? React.createElement(this.props.headingType, {className: this.props.headingColor},this.props.heading) : '';
      return (<div className="heading"> {headingElement} </div>);
    }
}
MapTo('my-aem-project/components/content/custom-heading')(CustomHeading, CustomHeadingEditConfig);